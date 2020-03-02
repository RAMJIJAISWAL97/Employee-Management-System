class Traversal {
    static void dfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[]) {
        ArrayList l = list.get(s);
        vis[s] = true;
        System.out.print(s+" ");
        int i = 0, n = l.size();
        if(l != null) {
            while(n > i) {
                if(!vis[(Integer)l.get(i)]) {
                    //vis[(Integer)l.get(i)] = true;
                    dfs((Integer)l.get(i), list, vis);
                }
                ++i;
            }
        }
    }
}
