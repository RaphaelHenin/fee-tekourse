package fr.fee.tekourse.feetekourse.service.impl;

import fr.fee.tekourse.feetekourse.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {
    @Override
    public HttpStatus getRecipeServiceExample(int id) {
        if(id == 1){
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
