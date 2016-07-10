package printing;

public class PaperTray 
{    
 private int pages=0;
 protected void addPaper(int count)
 {
     pages=pages+count;
 }
 protected void usePaper()
 {
  pages=pages-1;   
 }
 protected boolean isEmpty()
 {
     return pages<=0;
 }
}
