class Solution:
    def getSubarrayBeauty(self, nums: List[int], k: int, x: int) -> List[int]:
        freq = [0] * 101
        ans = []

        for i in range(k):
            freq[nums[i] + 50] += 1

        def beauty():
            cnt = 0
            for v in range(-50, 0):
                cnt += freq[v + 50]
                if cnt >= x:
                    return v
            return 0

        ans.append(beauty())

        for i in range(k, len(nums)):
            freq[nums[i - k] + 50] -= 1
            freq[nums[i] + 50] += 1
            ans.append(beauty())

        return ans   