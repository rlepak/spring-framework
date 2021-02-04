package com.cybertek.repository;

import com.cybertek.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
//    // ------------------- DERIVED QUERIES ------------------- //
////Write a derived query to count how many tickets a user bought
//    Integer countAllByUserId(Long userId);
//
////Write a derived query to list all tickets by specific email
//    List<Ticket> findAllByUserEmail(String email);
//
////Write a derived query to count how many tickets are sold for a specific movie
//    Integer countAllByMovieCinemaMovieName(String name);
//
////Write a derived query to list all tickets between a range of dates
//    List<Ticket> findAllByDateTimeBetween(LocalDateTime date1, LocalDateTime date2);
//
//// ------------------- JPQL QUERIES ------------------- //
////Write a JPQL query that returns all tickets are bought from a specific user
//    @Query("select t from Ticket t where t.user.id = ?1")
//    List<Ticket> fetchAllTicketsByUserJPQL(Long userId);
////Write a JPQL query that returns all tickets between a range of dates
//    @Query("select t from Ticket t where t.dateTime between ?1 and ?2")
//    List<Ticket> fetchAllTicketWithRangeDates(LocalDate start, LocalDate end);
//
//// ------------------- Native QUERIES ------------------- //
////Write a native query to count the number of tickets a user bought
//    @Query(value = "select count (*) from Ticket where user_acoount_id=?1", nativeQuery = true)
//    Integer countTicketByUser(Long userId);
////Write a native query to count the number of tickets a user bought in a specific range of dates
////Write a native query to distinct all tickets by movie name
////Write a native query to find all tickets by user email
////Write a native query that returns all tickets
////Write a native query to list all tickets where a specific value should be containable in the username or name or movie name

}
