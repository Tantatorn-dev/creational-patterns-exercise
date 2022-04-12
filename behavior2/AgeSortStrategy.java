package creational.behavior2;

import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
    @Override
    public void customSort(List<Person> people) {
        people.sort((p1, p2) -> p1.getAge() - p2.getAge());
    }
}
