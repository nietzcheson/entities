package com.m4c.model.entity;

import com.m4c.model.base.IDEntity;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang.StringUtils;

/**
 * Date: 3/10/2007
 *
 * @author Elvira Aranda
 * @version 1.1
 */

@Entity
@Table(name = "M4CPICKUP")
@javax.persistence.SequenceGenerator(name="SEQ_GEN", sequenceName="IDPICKUP")
public class Pickup implements IDEntity {

	private static final long serialVersionUID = 1L;
	private Long id;
    private Date serviceDate;
    private String airline;
    private String flight;
    private double paxNumber;
    private String firstName;
    private String lastName;
    private Operator operator;
    private String from;
    private String to;
    private String type; //Llegada - Salida
    private List<Reservation> reservations = new ArrayList<Reservation>();

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FECHA")
    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    @Column(name = "ORIGEN")
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    @Column(name = "DESTINO")
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    @ManyToOne
    @JoinColumn(name = "OPERADOR_ID")
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Column(name = "AEROLINEA")
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Column(name = "VUELO")
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @Column(name = "PAX")
    public double getPaxNumber() {
        return paxNumber;
    }

    public void setPaxNumber(double paxNumber) {
        this.paxNumber = paxNumber;
    }

    @Column(name = "NOMBRE")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "APELLIDO")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Transient
    public String getName() {
        return firstName + " " + lastName;
    }

    @Column(name = "TIPO")
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @ManyToMany(
            targetEntity = com.m4c.model.entity.Reservation.class,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name = "M4CRESERVACION_PICKUP",
            joinColumns = {@JoinColumn(name = "PICKUP_ID")},
            inverseJoinColumns = {@JoinColumn(name = "RESERVACION_ID")}
    )
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public boolean add(Reservation reservation) {
        return reservations.add(reservation);
    }   

	@Transient
    public String getReservationsId() {
        String ids = "";
        for (Reservation r : reservations) {
            ids = ids + r.getId().toString() + ",";
        }
        if (StringUtils.isNotBlank(ids))
            ids = ids.substring(0, ids.length() - 1);

        return ids;
    }

    @Transient
    public String getReservationsConfirms() {
        String confirms = "";
        for (Reservation r : reservations) {
            if (r.getConfirm() != null)
                confirms = confirms + r.getConfirm().trim() + ",";
        }
        if (StringUtils.isNotBlank(confirms))
            confirms = confirms.substring(0, confirms.length() - 1);
        return confirms;
    }

    @Transient
    public String getProgram() {
        String program = "";
        if (!reservations.isEmpty()) {
            if (reservations.get(0).getProgram() != null) {
                program = reservations.get(0).getProgram().getId().toString();
                if (program.equals("1"))
                    program = "M4C";
                if (program.equals("3"))
                    program = "M4SG";
                if (program.equals("4"))
                    program = "YH";
                if (program.equals("5"))
                    program = "BLUESTR";
            }
        }
        return program;
    }

   /* @Transient
    public String getCallCenter() {
        String callCenter = "";
        if (!reservations.isEmpty()) {
            if (reservations.get(0).getCustomer().getCallCenter() != null && reservations.get(0).getProgram() != null) {
                callCenter = reservations.get(0).getCustomer().getCallCenter().getName();
                if (reservations.get(0).getCustomer().getCallCenter().getId() != 46 && reservations.get(0).getCustomer().getCallCenter().getId() != 43) {
                    if (reservations.get(0).getCustomer().getCallCenter().getIdSunset() != null) {
                        if (reservations.get(0).getCustomer().getCallCenter().getParadise() != null) {
                            if (reservations.get(0).getCustomer().getCallCenter().getIdSunset().equals("012") && reservations.get(0).getCustomer().getCallCenter().getParadise()==1 && reservations.get(0).getProgram().getId() == 3)
                                callCenter = "PARADISE DESTINATION";
                        }
                        if (reservations.get(0).getCustomer().getCallCenter().getIdSunset().equals("012") && reservations.get(0).getProgram().getId() == 1)
                            callCenter = "FLY TO CANCUN";
                    } else if (reservations.get(0).getProgram().getId() == 3)
                        callCenter = "CARRIBEAN VACATIONS";
                }
            }
        }
        return callCenter;
    }*/
    
    @Transient
    public String getCallCenter() {
        String callCenter = "";
        if (!reservations.isEmpty()) {
            if (reservations.get(0).getCustomer().getCallCenter() != null)
                callCenter = reservations.get(0).getCustomer().getCallCenter().getName();                
            
        }
        return callCenter;
    }

}