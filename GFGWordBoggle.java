import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int x = sc.nextInt();
            String[] dictionary = new String[x];
            for(int i=0;i<x;i++)
            {
                dictionary[i] = sc.next();
            }
            
            Arrays.sort(dictionary);
            int m = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());
            
            char board[][] = new char[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    board[i][j] = sc.next().charAt(0);
                }
            }
            
            Solution T = new Solution();
            String[] ans = T.wordBoggle(board, dictionary);
            
            if(ans.length == 0) System.out.println("-1");
            else
            {
                Arrays.sort(ans);
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            t--;
        }
    }
}
// } Driver Code Ends
//User function Template for Java

class Solution
{
    public static void dfs(char a[][],int dx[],int dy[],int i,int j,int m,int n,String ss[], String s, TreeSet <String> ll, boolean v[][]) { 
        int nn = s.length();
        for(String s1 : ss) {
                if(s1.length() == nn && s1.equals(s)) {
                       ll.add(s1);
                    }
                }
        //System.out.println((s));
        for(int k = 0; k < 8;k++) { 
                //System.out.println((i+dx[k]) +" "+(j+dy[k])+" t ");
            if((i+dx[k]) >= 0 && (i+dx[k]) < m && (j+dy[k]) >= 0 && (j+dy[k] < n)) {
                            
                for(String s1 : ss) {
                    if(s1.length() >= (nn+1) && s1.substring(0,nn + 1).equals(s+a[i + dx[k]][j + dy[k]]) && !v[i+dx[k]][j + dy[k]]) {
                        v[i+dx[k]][j + dy[k]] = true;
                        //System.out.println((s));
                        dfs(a, dx, dy, i + dx[k] , j + dy[k], m, n,ss,s+a[i + dx[k]][j + dy[k]]+"",ll,v);
                        //System.out.println("here"+(s+a[i + dx[k]][j + dy[k]]));
                        v[i+dx[k]][j + dy[k]] = false;
                    }
                }
            }
        }
    }
    public String [] wordBoggle(char b[][], String[] s) {
        TreeSet <String> ll = new TreeSet<String>();
        
        int dx[] = {-1 , -1 , -1 , 0  , 0, 1, 1, 1};
        int dy[] = {-1 , 0 , 1 , -1 ,1, -1, 0, 1};
        int m = b.length, n = b[0].length;
        boolean v[][] = new boolean[m][n];
        
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n ;j++) {
                for(String str : s) {
                    
                    if(b[i][j] == str.charAt(0) && !v[i][j]) {
                        v[i][j] = true;
                        //System.out.println(str);
                        dfs(b, dx, dy, i , j, m, n,s,b[i][j]+"",ll,v);
                        v[i][j] = false;
                    }
                }
            }
        }
        String ars [] = new String[ll.size()];
        int lp = 0;
        for(String st : ll) {
            ars[lp++] = st;
        }
        return ars;
    }
}
