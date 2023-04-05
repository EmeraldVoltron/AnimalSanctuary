/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Apr 4, 2023
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beans.Animals;


/**
 * @author abbyb
 *
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animals, Long>{
	
}
