package finalproject.com.example.demo.Repostory;

import finalproject.com.example.demo.Entity.EntityFinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FinalRepo extends JpaRepository<EntityFinal,Integer> {


}

