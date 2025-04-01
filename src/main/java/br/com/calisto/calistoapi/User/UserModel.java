package br.com.calisto.calistoapi.User;

import java.util.List;

import br.com.calisto.calistoapi.Training.TrainingModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "td_user")
@AllArgsConstructor
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private int idade;
    private String email;
    private String senha;
    @OneToMany(mappedBy="user")
    private List<TrainingModel> training;
}