 import java.lang.*;

class Library{
   String[] book;
   int no_of_book;
   Library(){
    this.book = new String[50];
    no_of_book = 0;
   }
   void addBook(String book){
    this.book[no_of_book] = book;
    no_of_book++;
    System.out.println(book +" has been added");
   }
   void showAvalibleBook(){
    System.out.println("the avalible books are : ");
    for (String Book : this.book) {
        if(Book == null){
            continue;
        }
        System.out.println("_ "+ Book);
     }
     }
   void returnBook(String book){
    addBook(book);
    }
    void issuebook(String book){
        for(int i=0; i<this.book.length; i++){ 
            if(this.book[i] == book){
                this.book[i] = null;
                System.out.println("the book has issued" + book);
            }
        }
        System.out.println("this book is not exist in library");
    }
}

public class online_library {
    public static void main(String[] args){
        // online library which has functionality
        // add book ,show avalible book,returnbook, issuebook
        Library lr = new Library();
        lr.addBook("mahabharat");
        lr.addBook("c ++");
        lr.addBook("think and grow");
        lr.showAvalibleBook();
        // lr.returnBook("ramayan");
        lr.issuebook("mahabharat");
        lr.showAvalibleBook();

    }
}
