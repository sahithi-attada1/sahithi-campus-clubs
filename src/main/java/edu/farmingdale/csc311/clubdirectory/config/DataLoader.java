package edu.farmingdale.csc311.clubdirectory.config;

import edu.farmingdale.csc311.clubdirectory.club.Club;
import edu.farmingdale.csc311.clubdirectory.club.ClubRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ClubRepository clubRepository;

    public DataLoader(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public void run(String... args) {
        if (clubRepository.count() == 0) {
            clubRepository.save(new Club(
                    "Computer Science Club",
                    "Academic",
                    "Tuesday",
                    "Lupton Hall 120"
            ));

            clubRepository.save(new Club(
                    "Chess Club",
                    "Games",
                    "Wednesday",
                    "Campus Center 205"
            ));

            clubRepository.save(new Club(
                    "Running Club",
                    "Sports",
                    "Friday",
                    "Nold Hall"
            ));
        }
    }
}
