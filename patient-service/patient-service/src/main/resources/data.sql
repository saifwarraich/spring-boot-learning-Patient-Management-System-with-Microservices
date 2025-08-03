-- Create the patient table according to the Java class definition
CREATE TABLE IF NOT EXISTS patient (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    adress VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    date_of_registration DATE NOT NULL,
    gender VARCHAR(10) NOT NULL
);

-- Insert 5 sample patients using fixed UUIDs

INSERT INTO patient (id, name, email, adress, date_of_birth, date_of_registration, gender) VALUES
('123e4567-e89b-12d3-a456-426614174000', 'Alice Johnson', 'alice.johnson@example.com', '123 Main St, NY', '1990-04-12', '2023-05-01', 'Female'),
('123e4567-e89b-12d3-a456-426614174001', 'Bob Smith', 'bob.smith@example.com', '456 Oak Ave, CA', '1985-07-23', '2022-11-10', 'Male'),
('123e4567-e89b-12d3-a456-426614174002', 'Carol White', 'carol.white@example.com', '789 Pine Rd, IL', '1992-01-17', '2023-01-05', 'Female'),
('123e4567-e89b-12d3-a456-426614174003', 'David Brown', 'david.brown@example.com', '321 Cedar Blvd, TX', '1988-09-30', '2024-03-15', 'Male'),
('123e4567-e89b-12d3-a456-426614174004', 'Eva Green', 'eva.green@example.com', '654 Maple Ln, WA', '1995-06-20', '2023-09-18', 'Female');
