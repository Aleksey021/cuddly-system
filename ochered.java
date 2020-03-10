package dgfr;

import java.util.*;

public class ochered {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("введите A[" + (i + 1) + "]= ");
            A[i] = in.nextInt();}
        Deque<Integer> dec1 = new Deque<>() {


            @Override
            public void addFirst(Integer integer) {

            }

            @Override
            public void addLast(Integer integer) {

            }

            @Override
            public boolean offerFirst(Integer integer) {
                return false;
            }

            @Override
            public boolean offerLast(Integer integer) {
                return false;
            }

            @Override
            public Integer removeFirst() {
                return null;
            }

            @Override
            public Integer removeLast() {
                return null;
            }

            @Override
            public Integer pollFirst() {
                return null;
            }

            @Override
            public Integer pollLast() {
                return null;
            }

            @Override
            public Integer getFirst() {
                return null;
            }

            @Override
            public Integer getLast() {
                return null;
            }

            @Override
            public Integer peekFirst() {
                return null;
            }

            @Override
            public Integer peekLast() {
                return null;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return null;
            }

            @Override
            public Integer poll() {
                return null;
            }

            @Override
            public Integer element() {
                return null;
            }

            @Override
            public Integer peek() {
                return null;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public void push(Integer integer) {

            }

            @Override
            public Integer pop() {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public Iterator<Integer> descendingIterator() {
                return null;
            }
        };
        Deque<Boolean> dec2 = new Deque<>() {
            @Override
            public void addFirst(Boolean aBoolean) {

            }

            @Override
            public void addLast(Boolean aBoolean) {

            }

            @Override
            public boolean offerFirst(Boolean aBoolean) {
                return false;
            }

            @Override
            public boolean offerLast(Boolean aBoolean) {
                return false;
            }

            @Override
            public Boolean removeFirst() {
                return null;
            }

            @Override
            public Boolean removeLast() {
                return null;
            }

            @Override
            public Boolean pollFirst() {
                return null;
            }

            @Override
            public Boolean pollLast() {
                return null;
            }

            @Override
            public Boolean getFirst() {
                return null;
            }

            @Override
            public Boolean getLast() {
                return null;
            }

            @Override
            public Boolean peekFirst() {
                return null;
            }

            @Override
            public Boolean peekLast() {
                return null;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(Boolean aBoolean) {
                return false;
            }

            @Override
            public boolean offer(Boolean aBoolean) {
                return false;
            }

            @Override
            public Boolean remove() {
                return null;
            }

            @Override
            public Boolean poll() {
                return null;
            }

            @Override
            public Boolean element() {
                return null;
            }

            @Override
            public Boolean peek() {
                return null;
            }

            @Override
            public boolean addAll(Collection<? extends Boolean> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public void push(Boolean aBoolean) {

            }

            @Override
            public Boolean pop() {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Iterator<Boolean> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public Iterator<Boolean> descendingIterator() {
                return null;
            }
        };
        dec1.addAll(Arrays.asList(A[0],A[1],A[2],A[3],A[4],A[5],A[6],A[7],A[8],A[9]));
        for (int i = 0; i < 10; i = i+2) {
          dec2.add(dec1.remove(A[i]));
        }
        for (int i = 1; i < 10; i = i+2) {
            dec2.add(dec1.remove(A[i]));
        }
        System.out.println(dec2);
    }
}