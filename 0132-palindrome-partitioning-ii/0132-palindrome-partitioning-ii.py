class Solution:
    def minCut(self, s: str) -> int:
        n = len(s)

        dp = [0] * (n+1)
        dp[0] = 0

        for i in range(n+1):
            dp[i] = i
        
        for center in range(n):

            l = r = center

            while l >= 0 and r < n and s[l] == s[r]:
                dp[r+1] = min(dp[r+1], dp[l]+1)
                l -= 1
                r += 1
            
            l, r = center, center + 1
            while l >= 0 and r < n and s[l] == s[r]:
                dp[r + 1] = min(dp[r + 1], dp[l] + 1)
                l -= 1
                r += 1
        
        return dp[n]-1
