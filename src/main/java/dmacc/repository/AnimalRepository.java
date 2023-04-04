/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Apr 4, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Animal;


/**
 * @author abbyb
 *
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{
	
}
