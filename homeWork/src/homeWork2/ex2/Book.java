package homeWork2.ex2;

import java.util.ArrayList;

/**
 * Created by tish on 12.02.14.
 * 1. По массиву слов найти все страницы где есть подобные слова(в массиве).
 * 2. найти и удалить пустые страницы
 * 3. Вставить новую страницу в заданную позицию
 * 4. Посчитать количество слов во всем тексте.
 */
public class Book {
    private String name;
    private String author;
    private int numbOfPages;
    private ArrayList<Page> pages;

    public Book(String name, String author, int numbOfPages, ArrayList<Page> pages) {
        this.name = name;
        this.author = author;
        this.numbOfPages = numbOfPages;
        this.pages = pages;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public void findTheWord(){

    }
}
