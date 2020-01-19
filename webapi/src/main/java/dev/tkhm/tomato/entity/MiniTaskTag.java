package dev.tkhm.tomato.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "minitask_tags")
public class MiniTaskTag implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "minitask_id")
    public UUID minitaskId;
    @Id
    @Column(name = "tag_name")
    public String tagName;

    /* (non-Javadoc) Multi PKに対応するための必須実装, PKを全て指定する */
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof MiniTaskTag) {
            MiniTaskTag other = MiniTaskTag.class.cast(obj);
            result = new EqualsBuilder().append(minitaskId, other.minitaskId).append(tagName, other.tagName).isEquals();
        }
        return result;
    }

    /* (non-Javadoc) Multi PKに対応するための必須実装, PKを全て指定する */

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minitaskId).append(tagName).toHashCode();
    }
}
