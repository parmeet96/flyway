package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Statement;

public class V3_0__insert_addresses_thru_code implements JdbcMigration {

    public void migrate(Connection connection) throws Exception {
        Statement stmt = connection.createStatement();
        stmt.addBatch("INSERT INTO ADDRESS VALUES (1, 1, '221B', 'Baker Street', 'London', null, null, 'UK', null)");
        stmt.addBatch("INSERT INTO ADDRESS VALUES (2, 2, 'A-67', 'Sector 64', 'Noida', null, 'UP', 'India', null)");
        try {
            stmt.executeBatch();
        } finally {
            stmt.close();
        }
    }
}
