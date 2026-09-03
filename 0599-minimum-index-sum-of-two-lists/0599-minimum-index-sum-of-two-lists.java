class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> s1 = new HashMap<>();
        HashMap<String, Integer> s2 = new HashMap<>();

    
        for (int i = 0; i < list1.length; i++) {
            s1.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            s2.put(list2[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        ArrayList<String> res = new ArrayList<>();

        for (String restaurant : list1) {
            if (s2.containsKey(restaurant)) {

                int sum = s1.get(restaurant) + s2.get(restaurant);
                if (sum < minSum) {
                    minSum = sum;
                    res.clear();
                    res.add(restaurant);
                }
                else if (sum == minSum) {
                    res.add(restaurant);
                }
            }
        }

        return res.toArray(new String[0]);
    }
}