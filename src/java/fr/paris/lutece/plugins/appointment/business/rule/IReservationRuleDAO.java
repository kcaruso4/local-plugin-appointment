package fr.paris.lutece.plugins.appointment.business.rule;

import java.time.LocalDate;
import java.util.List;

import fr.paris.lutece.portal.service.plugin.Plugin;

/**
 * ReservationRule DAO Interface
 * 
 * @author Laurent Payen
 *
 */
public interface IReservationRuleDAO
{

    /**
     * The name of the bean of the DAO
     */
    static String BEAN_NAME = "appointment.reservationRuleDAO";

    /**
     * Insert a new record in the table
     * 
     * @param reservationRule
     *            instance of the ReservationRule object to insert
     * @param plugin
     *            the plugin
     */
    void insert( ReservationRule reservationRule, Plugin plugin );

    /**
     * Update the record in the table
     * 
     * @param reservationRule
     *            the reference of the ReservationRule
     * @param plugin
     *            the plugin
     */
    void update( ReservationRule appointment, Plugin plugin );

    /**
     * Delete a record from the table
     * 
     * @param nIdReservationRule
     *            int identifier of the ReservationRule to delete
     * @param plugin
     *            the plugin
     */
    void delete( int nIdReservationRule, Plugin plugin );

    /**
     * Load the data from the table
     * 
     * @param nIdReservationRule
     *            the identifier of the ReservationRule
     * @param plugin
     *            the plugin
     * @return the instance of the ReservationRule
     */
    ReservationRule select( int nIdReservationRule, Plugin plugin );

    /**
     * Returns all the Reservation Rule of the form given
     * 
     * @param nIdForm
     *            the Form Id
     * @param plugin
     *            the plugin
     * @return a list of reservation rule of the form
     */
    List<ReservationRule> findByIdForm( int nIdForm, Plugin plugin );

    /**
     * Returns the Reservation Rule with the given search parameters
     * 
     * @param nIdForm
     *            the Form Id
     * @param dateOfApply
     *            the date of apply
     * @param plugin
     *            the plugin
     * @return the reservation rule that matches
     */
    ReservationRule findByIdFormAndDateOfApply( int nIdForm, LocalDate dateOfApply, Plugin plugin );

    /**
     * Returns the Reservation Rule with the given search parameters
     * 
     * @param nIdForm
     *            the Form Id
     * @param dateOfApply
     *            the date of apply
     * @param plugin
     *            the plugin
     * @return the reservation rule that matches
     */
    ReservationRule findByIdFormAndClosestToDateOfApply( int nIdForm, LocalDate dateOfApply, Plugin plugin );

}