/*
Ques link: https://leetcode.com/problems/minimum-time-difference/?envType=daily-question&envId=2024-09-16
*/
class Solution {
public:
    int findMinDifference(vector<string>& timePoints) {
         vector<int>ans;
        for(string i: timePoints){
            string h = i.substr(0,2);
            string m = i.substr(3,2);
            int hr = stoi(h);
            int mins = stoi(m);
            ans.push_back(hr*60 + mins);
             //cout<<hr<<" "<<mins<<endl;
        }
        sort(ans.begin(),ans.end());
        int n=ans.size();
        int minn=INT_MAX;
        for(int i=0;i<n-1;i++){
            minn = min(minn,ans[i+1]-ans[i]);
            minn = min(minn,24*60 - minn);
        }
        minn = min(minn,24*60+ans[0] - ans[n-1]);
        return minn;
    }
};