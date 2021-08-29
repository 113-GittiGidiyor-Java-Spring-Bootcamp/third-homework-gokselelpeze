package goksel.elpeze.h2db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PermanentInstructor extends Instructor {

    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private double fixedSalary;

}
