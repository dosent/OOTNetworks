package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.DatabaseIO;
import com.simbirsoft.examples.OOTNetworks.api.Equipment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;


public class DatabaseSQLite implements DatabaseIO {

    static final String JDBC_DRIVER = "org.sqlite.JDBC";
    static final String DB_URL = "jdbc:sqlite:db/base.sqlite";

    private static DatabaseSQLite databaseSQLite;
    private Statement statement;
    private Logger logger = LoggerFactory.getLogger(DatabaseSQLite.class);


    public Integer addEquipment(Equipment equipment) {
        Integer result = null;
        if (!isNull(databaseSQLite)) {
            StringBuilder sqlString = new StringBuilder();
            sqlString.append("insert into Equipment (Name, SerialNumber) values ('");
            sqlString.append(equipment.getName());
            sqlString.append("','");
            sqlString.append(equipment.getSerialNumber());
            sqlString.append("')");
            try {
                statement.executeUpdate(sqlString.toString());
                ResultSet rs = statement.getGeneratedKeys();
                if (rs != null && rs.next()) {
                    result = ((Long) (rs.getLong(1))).intValue();
                }
                logger.info("Run ok addEquipment sql:{}", sqlString.toString());
            } catch (SQLException e) {
                e.printStackTrace();
                logger.info("Run error addEquipment sql:{}", sqlString.toString());
            }
        }
        return result;
    }

    public Boolean deleteEquipment(Integer EquipmentID) {
        return null;
    }

    public static DatabaseIO getDatabase() {
        if (isNull(databaseSQLite)) {
            databaseSQLite = new DatabaseSQLite();
            try {
                Class.forName(JDBC_DRIVER);
                Connection connection = null;
                connection = DriverManager.getConnection(DB_URL);
                databaseSQLite.statement = connection.createStatement();
                databaseSQLite.statement.setQueryTimeout(30);
            } catch (Exception e) {
                e.printStackTrace();
                databaseSQLite.logger.info("Error create connection base");
                databaseSQLite = null;
            }
        }
        return databaseSQLite;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }
}
