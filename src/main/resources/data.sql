-- Sample data insertion for testing (optional)
INSERT INTO users (username, email, password_hash, first_name, last_name, phone_number, date_of_birth, profile_picture, created_at, updated_at, last_login, is_active, is_verified, role)
VALUES ('johndoe', 'johndoe@example.com', '$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36OPaa24.sTwpbPVi/Ubx0K', 'John', 'Doe', '1234567890', '1980-01-01', 'http://example.com/profile/johndoe.jpg', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, NULL, TRUE, FALSE, 'customer');

INSERT INTO addresses (user_id, address_type, address_line1, address_line2, city, state, postal_code, country, created_at, updated_at)
VALUES (1, 'home', '123 Main St', 'Apt 4', 'Springfield', 'IL', '62704', 'USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
