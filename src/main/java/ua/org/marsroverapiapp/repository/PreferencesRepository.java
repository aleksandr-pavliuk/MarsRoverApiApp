package ua.org.marsroverapiapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.org.marsroverapiapp.dto.HomeDto;

/**
 * @author Alex
 * @link https://intvw.me
 */
public interface PreferencesRepository extends JpaRepository<HomeDto, Long> {

  HomeDto findByUserId(Long userId);
}

