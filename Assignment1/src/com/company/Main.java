package com.company;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws IOException{
        try{
            //Read text file containing ULRs
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

        // Read text files containing words
        File wordsFile = new File("..\\Assignment1\\Words.txt");
        String[] wordStr = new String[(int) wordsFile.length()];
        Scanner sc = new Scanner(wordsFile);
        sc.useDelimiter(" ");
        int j = 0;
        while (sc.hasNext()) {
            wordStr[j] = sc.next();
            j++;
        }
        //ArrayList to store words to be serched
        ArrayList<String> fileContent = new ArrayList<String>(Arrays.asList(wordStr));
        //HashMap to store words and their total  occurane for Output#2
        HashMap<String,Integer> finalCount = new HashMap<>();
        System.out.println("Output #1");
        System.out.println("=========");

            //Loop for each url
        for(int l=0;l<urlsCount;l++) {
            //Hashmap to store content of each url
            HashMap<String, Integer> eachUrlCount = new HashMap<>();
            ArrayList<Integer> urlWordsCount = new ArrayList<>();
            System.out.println(urlStr[l]);
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
            }catch (MalformedURLException e){
                System.out.println("Exception : " + e);
            }

        }
        Collection<Integer> values = finalCount.values();
        ArrayList<Integer> listOfValues = new ArrayList<>(values);
        Collections.sort(listOfValues);
        System.out.println("==================================");
        System.out.println("Output #2");
        System.out.println("=========");
        int l= listOfValues.size()-1;
        for(int y=l;y>=0;y--){
            String s = getKey(finalCount, listOfValues.get(y));
            System.out.println(s+ " : "+ listOfValues.get(y));
            fileContent.remove(s);
        }
        }catch(IOException e){
            System.out.println("Exception:" + e);
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
