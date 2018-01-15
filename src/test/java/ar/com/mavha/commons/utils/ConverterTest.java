package ar.com.mavha.commons.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo Cesar Canale
 */
public class ConverterTest {

    public ConverterTest() {
    }

    @Test
    public void testMap() {
        Order order = new Order(new Customer(new Name("firstName", "lastName")), new Address("street", "city"));
        OrderDTO orderDTO = Converter.map(OrderDTO.class, order);
        assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
        assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
        assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
        assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());
    }

}

class Order {

    private Customer customer;
    private Address billingAddress;

    public Order() {
    }

    public Order(Customer customer, Address billingAddress) {
        this.customer = customer;
        this.billingAddress = billingAddress;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the billingAddress
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * @param billingAddress the billingAddress to set
     */
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

}

class Customer {

    public Customer() {
    }

    public Customer(Name name) {
        this.name = name;
    }

    private Name name;

    /**
     * @return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

}

class Name {

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

class Address {

    public Address() {
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    private String street;
    private String city;

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

}

class OrderDTO {

    private String customerFirstName;
    private String customerLastName;
    private String billingStreet;
    private String billingCity;

    /**
     * @return the customerFirstName
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * @param customerFirstName the customerFirstName to set
     */
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    /**
     * @return the customerLastName
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * @param customerLastName the customerLastName to set
     */
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    /**
     * @return the billingStreet
     */
    public String getBillingStreet() {
        return billingStreet;
    }

    /**
     * @param billingStreet the billingStreet to set
     */
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    /**
     * @return the billingCity
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * @param billingCity the billingCity to set
     */
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

}
