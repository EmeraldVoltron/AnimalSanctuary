/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Apr 4, 2023
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author abbyb
 *
 */
@Entity
@Data
@NoArgsConstructor
public class Animal {
	@Id
	@GeneratedValue
	private int id;
}
