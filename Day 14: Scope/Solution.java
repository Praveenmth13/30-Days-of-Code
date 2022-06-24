
 public Difference(int []elements)
    {
        this.elements=elements;
    }
    void computeDifference(){
        int n=elements.length;
        Arrays.sort(elements);
        maximumDifference=Math.abs(elements[n-1]-elements[0]);
    }

