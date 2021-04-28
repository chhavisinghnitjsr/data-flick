package org.dataflick.entity;
import org.dataflick.core.DBSystem;
import org.dataflick.core.SourceType;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.UUID;

/***
 * {
 *     "url": "localhost:3545",
 *     "user": "abc",
 *     "password": "144",
 *     "source_type": "DATABASE",
 *     "system": "POSTGRES"
 * }
 */

@Entity
@Table(name = "datasource")
public class DataSourceEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private String id;

    @Column(name = "name")
    private String name;
    @Column(name = "url")
    private String url;
    @Column(name = "userid")
    private String userid;
    @Column(name = "password")
    private String password;
    @Column(name = "source_type")
    private SourceType type;
    @Column(name = "db_system")
    private DBSystem dbSystem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SourceType getType() {
        return type;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    public DBSystem getDbSystem() {
        return dbSystem;
    }

    public void setDbSystem(DBSystem dbSystem) {
        this.dbSystem = dbSystem;
    }
}