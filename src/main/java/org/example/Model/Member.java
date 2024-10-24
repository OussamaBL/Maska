    package org.example.Model;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.time.LocalDate;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "members")
    public class Member {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "membership_number", nullable = false)
        private String membership_number;

        @Column(name = "last_name", nullable = false)
        private String last_name;

        @Column(name = "first_name", nullable = false)
        private String first_name;

        @Column(name = "identification_document", nullable = false)
        private String identification_document;

        @Column(name = "nationality")
        private String nationality;

        @Column(name = "membership_date")
        private LocalDate membership_date;

        @Column(name = "license_expiration_date")
        private LocalDate license_expiration_date;



    }
