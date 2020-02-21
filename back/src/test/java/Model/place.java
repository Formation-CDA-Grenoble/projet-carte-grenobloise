package Model;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "mayor_name")
@EntityListeners(AuditingEntityListener.class)
public class place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @Column(name = "mayor_name", nullable = false)
    private String mayor_name;

    @Column(name = "habitants_number", nullable = false)
    private int habitants_number;

    @Column(name = "Area", nullable = false)
    private int Area;

    @Column(name = "Tram_lines", nullable = false)
    private String Tram_lines;

    @Column(name = "External_link", nullable = false)
    private String External_link;

}  
