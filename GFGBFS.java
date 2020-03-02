Queue <Integer> q = new LinkedList <Integer> ();
        vis[src] = true;
        q.offer(src);
        System.out.print(src+" ");
        while(q.size() > 0) {
            int i = 0, n = q.poll();
            ArrayList <Integer> l = list.get(n);
            if(l != null) {
                while(l.size() > i) {
                    if(!vis[(Integer) l.get(i)]) {
                        System.out.print(l.get(i)+" ");
                        vis[(Integer) l.get(i)] = true;
                        q.offer((Integer)l.get(i));
                    }
                    ++i;
                }
            }
        }
