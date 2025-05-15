# Xcelore Doctor Suggestion Backend API

This Spring Boot 3 project is a backend application for a doctor-patient platform. It allows:
- Adding/removing doctors and patients
- Suggesting doctors based on a patient's symptom and location

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3
- Hibernate / JPA
- H2 In-memory database
- Spring Validation
- Swagger (via SpringDoc)

---

## 🚀 How to Run

```bash
./mvnw spring-boot:run
```

Or run `DoctorAppApplication.java` from your IDE.

---

## 🔗 Swagger UI

After running the project, open:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 📦 Endpoints

### Doctor

- `POST /api/doctors`: Add a new doctor
- `GET /api/doctors`: List all doctors
- `DELETE /api/doctors/{id}`: Delete a doctor

### Patient

- `POST /api/patients`: Add a new patient
- `GET /api/patients`: List all patients
- `DELETE /api/patients/{id}`: Delete a patient

### Suggestion

- `GET /api/suggest/{patientId}`: Suggest doctors based on patient's symptom and city

---

## ⚠️ Edge Cases Handled

- Location not yet supported → "We are still waiting to expand to your location"
- No doctor for a symptom in that city → "There isn’t any doctor present at your location for your symptom"
- Symptom not recognized → "Symptom not recognized"

---

## 📸 Screenshots

Use Postman or Swagger to test the APIs. Example requests are included in the Postman collection.

---

## 📁 Postman Collection

Import the provided `Xcelore-Postman-Collection.json` into Postman to test the APIs.
