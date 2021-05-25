package org.dataflick.entity;

import org.dataflick.core.Format;
import org.dataflick.core.Type;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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
@Table(name = "data_source")
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

    @Column(name = "params")
    private String params;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "format")
    @Enumerated(EnumType.STRING)
    private Format format;

    public void setFormat(Format format) {
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

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

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}