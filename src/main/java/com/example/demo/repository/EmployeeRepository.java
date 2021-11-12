package com.example.demo.repository;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT e FROM Employee e WHERE e.id = :id")
    Employee getEmployeeById(@Param("id") Integer id);

    @Query("SELECT new com.example.demo.dto.EmployeeDTO(e.id, e.fullName, e.birthday, e.phone, e.email, e.employee_type, e.employee_count) FROM Employee e where e.id = :id")
    EmployeeDTO getCertificateByEmployee(@Param("id") Integer id);

}
