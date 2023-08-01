import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class HealthCheckController {

    private final DataSource dataSource;

    public HealthCheckController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @PostMapping("/health")
    public ResponseEntity<String> health() {
        try (Connection connection = dataSource.getConnection()) {
            return ResponseEntity.ok("Database connection is OK");
        } catch (SQLException e) {
            return ResponseEntity.status(500).body("Database connection failed");
        }
    }
}