package silly.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @RestController
    public static class AmberWavesController {
        @GetMapping("/amber-waves")
        public ResponseEntity<AmberWave> fetchAmberWaves() {
            return ResponseEntity.ok(new AmberWave(true));
        }
    }

    public static class AmberWave {
        private boolean grain;

        public AmberWave() {

        }
        public AmberWave(boolean grain) {
            this.grain = grain;
        }

        public boolean isGrain() {
            return grain;
        }

        public void setGrain(boolean grain) {
            this.grain = grain;
        }
    }

}
