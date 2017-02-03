package com.faforever.api.data.domain;

import com.yahoo.elide.annotation.Include;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "global_rating")
@Include(rootLevel = true, type = "globalRating")
@Setter
public class GlobalRating {

  private int id;
  private Double mean;
  private Double deviation;
  private short numGames;
  private boolean isActive;
  private Player player;

  @Id
  @Column(name = "id")
  public int getId() {
    return id;
  }

  @Column(name = "mean")
  public Double getMean() {
    return mean;
  }

  @Column(name = "deviation")
  public Double getDeviation() {
    return deviation;
  }

  @Column(name = "numGames")
  public short getNumGames() {
    return numGames;
  }

  @Column(name = "is_active")
  public boolean isActive() {
    return isActive;
  }

  @OneToOne
  @JoinColumn(name = "id", updatable = false, insertable = false)
  public Player getPlayer() {
    return player;
  }
}
