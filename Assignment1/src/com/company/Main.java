package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws IOException{
        File urlFile = new File("..\\Assignment1\\URLs.txt");
        String[] urlStr = new String[(int)urlFile.length()];
        Scanner scan = new Scanner(urlFile);
        scan.useDelimiter(" ");
        int urlsCount=0;
        while(scan.hasNext())
        {
            urlStr[urlsCount] = scan.next();
            urlsCount++;
        }

        File wordsFile = new File("..\\Assignment1\\Words.txt");
        String[] wordStr = new String[(int) wordsFile.length()];
        Scanner sc = new Scanner(wordsFile);
        sc.useDelimiter(" ");
        int j = 0;
        while (sc.hasNext()) {
            wordStr[j] = sc.next();
            j++;
        }
        ArrayList<String> fileContent = new ArrayList<String>(Arrays.asList(wordStr));
        HashMap<String,Integer> finalCount = new HashMap<>();
        for(int l=0;l<urlsCount;l++) {
            HashMap<String, Integer> eachUrlCount = new HashMap<>();
            ArrayList<Integer> urlWordsCount = new ArrayList<>();
            int count = l + 1;
            System.out.println("ULR " + count + " : " + urlStr[l]);
            var url = new URL(urlStr[l]);


            try (var br = new BufferedReader(new InputStreamReader(url.openStream()))) {

                String line;
                ArrayList<String> UrlContent = new ArrayList<String>();

                while ((line = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(line, " <>=.");
                    while (st.hasMoreTokens()) {
                        UrlContent.add(st.nextToken());
                    }
                }
                UrlContent.retainAll(fileContent);

                for (String s : fileContent) {
                    if (s == null) {
                        break;
                    }
                    eachUrlCount.put(s,Collections.frequency(UrlContent, s));
                    urlWordsCount.add(Collections.frequency(UrlContent, s));

                }
                Collections.sort(urlWordsCount);
                for(int c=0;c<3;c++){
                    int val = urlWordsCount.get(j-c-1);
                    String s= getKey(eachUrlCount,val);
                    System.out.println(s + " : " + val);
                    if(finalCount.containsKey(s))
                    {
                        int temp = finalCount.get(s);
                        finalCount.replace(s,temp+val);
                    }
                    else{
                        finalCount.put(s,val);
                    }
                    eachUrlCount.remove(s);
                }
            }
        }
    }
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
