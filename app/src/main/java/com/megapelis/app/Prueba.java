
package com.megapelis.app;

import com.megapelis.api.model.dto.response.body.image.FindAllImageRS;
import com.megapelis.api.model.dto.response.body.image.FindByIdImageRS;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Prueba {
   private FindAllImageRS findAllImageRS = new FindAllImageRS();

    public Prueba() {

        FindByIdImageRS findByIdImageRS1 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS2 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS3 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS4 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS5 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS6 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS7 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS8 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS9 = new FindByIdImageRS();
        FindByIdImageRS findByIdImageRS10 = new FindByIdImageRS();

        findByIdImageRS1.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oFo9pJU82raS50DqZEoNmW9SBHb.jpg");
        findByIdImageRS2.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/imJ5d4d1oBK8RM0g4JJRVnXQ5c6.jpg");
        findByIdImageRS3.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8nPw22C41EUWXREWmY9iIivMXxm.jpg");
        findByIdImageRS4.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z9ajF6E39Hg2pXUofmUYgZHvdX.jpg");
        findByIdImageRS5.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lUZZhYLLDU4g4XGQ5tvjYNVytxc.jpg");
        findByIdImageRS6.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1xOSjSzY4k2MLRZ1phzYb0VJYaS.jpg");
        findByIdImageRS7.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yIzHw6az7SHEjxaVYy3hMd1Vyc.jpg");
        findByIdImageRS8.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1w3MlLZPqr2Pm5loQ9h2gJwenMr.jpg");
        findByIdImageRS9.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4JCyBaUJmMgmnDkLiOI8P3tDpqS.jpg");
        findByIdImageRS10.setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/miZFgV81xG324rpUknQX8dtXuBl.jpg");

        List<FindByIdImageRS> idImageRS = new ArrayList<>();
        idImageRS.add(findByIdImageRS1);
        idImageRS.add(findByIdImageRS2);
        idImageRS.add(findByIdImageRS3);
        idImageRS.add(findByIdImageRS4);
        idImageRS.add(findByIdImageRS5);
        idImageRS.add(findByIdImageRS6);
        idImageRS.add(findByIdImageRS7);
        idImageRS.add(findByIdImageRS8);
        idImageRS.add(findByIdImageRS9);
        idImageRS.add(findByIdImageRS10);
        findAllImageRS.setFindAll(idImageRS);
    }

    public  FindAllImageRS getFindAllImageRS() {
        return findAllImageRS;
    }

    public  void setFindAllImageRS(FindAllImageRS findAllImageRS) {
        this.findAllImageRS = findAllImageRS;
    }
}
