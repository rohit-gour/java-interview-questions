package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RecipeMain {
    public static void main(String[] args){
        List<Recipe> list = new ArrayList<>();
        list.add(new Recipe("Jalebi"));
        list.add(new Recipe("Samosa"));

        Map<String, Recipe> listOfRecipe = list.stream().collect(Collectors.toMap(Recipe::getRecipeName, Recipe->Recipe));

        listOfRecipe.entrySet().forEach(e->{
            System.out.println(e.getKey()+" = "+e.getValue());
        });
    }
}
