### Track 2: The Hashing & Lookup Pattern
*Transition from scanning structures repeatedly to utilizing fast memory lookups.*

* **Base Level: Two Sum**
    * *Problem:* Given an array of integers and a target, return indices of the two numbers such that they add up to the target.
    * *Core Concept:* Tracking seen elements in a Hash Map to resolve lookups in $O(1)$ time, transforming an $O(N^2)$ problem into $O(N)$.
* **Base Level: Find Duplicates**
    * *Problem:* Identify and return duplicate elements existing within an array.
    * *Core Concept:* Frequency counting or set insertions.
* **🚀 Level Up: 3Sum / 4Sum**
    * *Challenge:* Find all unique triplets or quadruplets in an array that sum up exactly to zero (or a target value).
    * *Why it's harder:* A naive map approach hits a wall with complex duplicate configurations. You must adapt by combining **Array Sorting with a Two-Pointer approach**, implementing careful conditional skips to skip duplicate values while preserving an optimized $O(N^2)$ runtime.

---