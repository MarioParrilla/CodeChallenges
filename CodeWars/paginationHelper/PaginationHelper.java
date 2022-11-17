package paginationHelper;
import java.util.Arrays;
import java.util.List;

public class PaginationHelper {
    //WAS SO HARD TO ME
    public static void main(String[] args) {
        PaginationHelperImpl<Character> helper = new PaginationHelperImpl<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 3);
        System.out.println(helper.pageCount());
        System.out.println(helper.itemCount());
        System.out.println(helper.pageItemCount(1));
        System.out.println(helper.pageIndex(2));
    }

    public static class PaginationHelperImpl<I> {
        private final List<I> list;
        private final int itemsPerPage;

        /**
         * The constructor takes in an array of items and a integer indicating how many
         * items fit within a single page
         */
        public PaginationHelperImpl(List<I> collection, int itemsPerPage) {
            this.list = collection;
            this.itemsPerPage = itemsPerPage;
        }

        /**
         * returns the number of items within the entire collection
         */
        public int itemCount() {
            return list.size();
        }

        /**
         * returns the number of pages
         */
        public int pageCount() {
            return (int) Math.ceil(list.size()/(double)itemsPerPage);
        }

        /**
         * returns the number of items on the current page. page_index is zero based.
         * this method should return -1 for pageIndex values that are out of range
         */
        public int pageItemCount(int pageIndex) {
            if (pageIndex > pageCount()-1 || pageIndex < 0)
                return -1;
            if (pageIndex == this.pageCount() - 1) {
                var items = this.itemCount() % this.itemsPerPage;
                return items == 0 ? this.itemsPerPage : items;
            } else {
                return this.itemsPerPage;
            }
        }

        /**
         * determines what page an item is on. Zero based indexes
         * this method should return -1 for itemIndex values that are out of range
         */
        public int pageIndex(int itemIndex) {
            if(itemIndex > itemCount() - 1 || itemIndex < 0)
                return -1;
            return Math.round(itemIndex / this.itemsPerPage);
        }
    }
}
