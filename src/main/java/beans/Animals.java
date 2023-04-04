/**
 * @author xbitt = twilkens
 * CIS171 - Spring 2023
 * Apr 4, 2023
 */
package beans;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xbitt
 *
 */
@Entity
@Data
@NoArgsConstructor
public class Animals {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String breed;
	private String species;
	private int age;
	private Date arrivalDate;
	private boolean goodWithKids;
	
	
	public Animals(String name, String species, int age) {
		
	}
	
	public Animals(String name, String breed, String species, int age, Date arrivalDate, boolean goodWithKids) {
		
	}
	
	public Animals(String name, int age) {
		
	}
	
	public Animals(String name) {
		
	}
}
	
