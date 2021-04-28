package org.dataflick.entity;

import org.dataflick.core.SourceType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

public class datasourcedelete {

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
    }

}
