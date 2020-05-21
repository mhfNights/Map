public class Reception {
    private Filter filter;

    public void recept(User u){
        if (u.getType()!=null){
            return;
        }
        if (filter!=null){
            filter.filter(u);
            return;
        }else {
            u.setType("A");
        }
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
