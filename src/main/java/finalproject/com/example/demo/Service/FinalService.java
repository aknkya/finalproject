package finalproject.com.example.demo.Service;

import finalproject.com.example.demo.Entity.EntityFinal;
import finalproject.com.example.demo.Repostory.FinalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinalService {
    @Autowired
    private final FinalRepo  finalRepo;


    public FinalService(FinalRepo finalRepo) {
        this.finalRepo = finalRepo;
    }

    public List<EntityFinal> getAll(){
        return finalRepo.findAll();
    }

    public Optional<EntityFinal> findbyid(Integer id){
        return finalRepo.findById(id);
    }

  public EntityFinal saveuser(EntityFinal entityFinal){
        return finalRepo.save(entityFinal);
  }
public void deletebyid(int id){
        finalRepo.deleteById(id);
}
}

