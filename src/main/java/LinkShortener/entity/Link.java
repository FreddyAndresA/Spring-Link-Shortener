package LinkShortener.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalUrl;
    @Column(unique = true)
    private String shortCode;
    private int counter;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;

    public Link() {
    }

    public Link(Long id, String originalLink, String shortCode, int counter, LocalDateTime createdAt, LocalDateTime expiresAt) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.shortCode = shortCode;
        this.counter = counter;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

}
