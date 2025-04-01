package br.com.calisto.calistoapi.Training;

import br.com.calisto.calistoapi.User.UserModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tb_training")
@AllArgsConstructor
@Data
public class TrainingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private int difficulty;
   @ManyToOne
   @JoinColumn(name="user_id")
    private UserModel user;
    
}
