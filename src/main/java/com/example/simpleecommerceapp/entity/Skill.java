package com.example.simpleecommerceapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int kalaNumber;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String slug;

    @Column(length = 1000)
    private String shortDescription;

    @Column(length = 4000)
    private String fullDescription;

    @Column(length = 2000)
    private String history;

    @Column(length = 2000)
    private String learningPoints;

    @Column(length = 2000)
    private String examples;

    @Column(length = 2000)
    private String contributionIdeas;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getKalaNumber() { return kalaNumber; }
    public void setKalaNumber(int kalaNumber) { this.kalaNumber = kalaNumber; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }

    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    public String getFullDescription() { return fullDescription; }
    public void setFullDescription(String fullDescription) { this.fullDescription = fullDescription; }

    public String getHistory() { return history; }
    public void setHistory(String history) { this.history = history; }

    public String getLearningPoints() { return learningPoints; }
    public void setLearningPoints(String learningPoints) { this.learningPoints = learningPoints; }

    public String getExamples() { return examples; }
    public void setExamples(String examples) { this.examples = examples; }

    public String getContributionIdeas() { return contributionIdeas; }
    public void setContributionIdeas(String contributionIdeas) { this.contributionIdeas = contributionIdeas; }
}
