# 🚀 Full-Stack DevOps System: Spring Boot + PostgreSQL + Monitoring

Kompleksowy system webowy zbudowany w architekturze mikro usługowej, demonstrujący pełny cykl życia aplikacji (SDLC) zgodnie z metodyką DevOps. Projekt łączy nowoczesny backend w Javie z zaawansowanym stosem monitoringu i automatyzacją wdrożeń (CI/CD).

## 🌟 Kluczowe Funkcjonalności
* **System Rejestracji i Logowania:** Bezpieczne zarządzanie użytkownikami z wykorzystaniem Spring Security i szyfrowania haseł BCrypt.
* **Architektura Kontenerowa:** Pełna konteneryzacja wszystkich usług za pomocą Docker i Docker Compose.
* **Monitoring Techniczny (Prometheus):** Zbieranie metryk JVM, zużycia CPU/RAM oraz statystyk zapytań HTTP w czasie rzeczywistym.
* **Monitoring Biznesowy (Grafana):** Interaktywne dashboardy wizualizujące dane techniczne oraz statystyki z bazy danych (liczba użytkowników).
* **System Alertingu:** Automatyczne wykrywanie awarii aplikacji i powiadamianie o stanach krytycznych.
* **Pełne wsparcie UTF-8:** Obsługa polskich znaków na każdym etapie przetwarzania danych.

## 🛠 Stos Technologiczny
* **Backend:** Java 17, Spring Boot 3, Spring Data JPA, Spring Security.
* **Baza Danych:** PostgreSQL 15.
* **Monitoring:** Prometheus, Grafana.
* **Infrastruktura:** Docker, Docker Compose, GitHub Actions (CI/CD).
* **Frontend:** HTML5, CSS3 (Responsive Design).

## 🏗 Architektura Systemu
System składa się z czterech głównych kontenerów współpracujących w jednej sieci Dockerowej:
1.  `app`: Aplikacja Spring Boot (Backend + Frontend).
2.  `db`: Relacyjna baza danych PostgreSQL.
3.  `prometheus`: System zbierania i przechowywania metryk typu Time-Series.
4.  `grafana`: Narzędzie do wizualizacji danych i zarządzania alertami.

## 🚀 Szybki Start (Deployment)

### Wymagania:
* Zainstalowany Docker oraz Docker Compose.

### Kroki do uruchomienia:
1. Sklonuj repozytorium:
   ```bash
   git clone [https://github.com/bartoszwisniewski91/learnit-devops-final-project.git](https://github.com/bartoszwisniewski91/learnit-devops-final-project.git)
   cd TWOJE_REPO